import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter host address: ");
        String ipAddress = scanner.nextLine();

        System.out.print("Please enter no of pings: ");
        int numOfPings = scanner.nextInt();

        System.out.println();
        ArrayList<Double> pingData = ping(ipAddress,6);
        double median = median(pingData);
        System.out.println("Median of pings is: "+median);
    }

    private static double median(ArrayList<Double> pingData) {
        int size = pingData.size();
        if(size%2==1){
            return pingData.get(size/2);
        }else {
            return (pingData.get(size/2)+pingData.get((size-1)/2))/2;
        }
    }

    public static ArrayList<Double> ping(String ipAddress,int noOfPings){
        String pingData = "";
        ArrayList<Double> pingTime = new ArrayList<Double>();
        String pingCmd = "ping "+ipAddress+" -c "+noOfPings;

        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(pingCmd);

            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String inputLine;
            System.out.println(in.readLine());
            for(int i=0;i<noOfPings;i++){
                inputLine = in.readLine();
                System.out.println(inputLine);
                String time = inputLine.split("time=")[1].replace(" ms","");
                pingTime.add(Double.parseDouble(time));
                pingData += inputLine;
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        return pingTime;
    }
}
