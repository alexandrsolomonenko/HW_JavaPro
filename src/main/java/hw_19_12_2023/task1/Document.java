package hw_19_12_2023.task1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Document {
    private String content;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Document(String content){
        this.content = content;
    }
    public void addRecords(String records){
        lock.writeLock().lock();
        try {
            content += records + "\n";
        }finally {
            lock.writeLock().unlock();
        }
    }
    public void editRecords(int index, String newRecords){
        lock.writeLock().lock();
        try {
            String[] lines = content.split("\\n");
            if (index >= 0 && index < lines.length) {
                lines[index] = newRecords;
                content = String.join("\n", lines);
            }
        }finally {
            lock.writeLock().unlock();
        }
    }
    public void deleteRecords(int index){
        lock.writeLock().lock();
        try {
            String[] lines = content.split("\\n");
            if (index >= 0 && index < lines.length){
                lines[index] = "";
                content = String.join("\n", lines);
            }
        }finally {
            lock.writeLock().unlock();
        }
    }
    public String getContent(){
        lock.readLock().lock();
        try {
            return content;
        }finally {
            lock.readLock().unlock();
        }
    }
}
