package hw_19_12_2023.task1;

public class User implements Runnable{
    private final Document document;

    public User (Document document){
        this.document = document;
    }
    public void run(){
        String content = document.getContent();
        document.addRecords("New write");
        document.editRecords(0,"Edit write");
        document.deleteRecords(0);
        saveChanges(content);
    }
    private void saveChanges(String content){

    }
}
