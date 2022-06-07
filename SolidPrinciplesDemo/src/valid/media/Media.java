package valid.media;

public abstract class Media {
    private String filename;

    public Media(String filename){
        this.filename=filename;
    }

    public  String getFilename(){
        return  filename;
    }

    public void setFilename(){
        this.filename=filename;
    }

    public  abstract  void  mediaType();
}
