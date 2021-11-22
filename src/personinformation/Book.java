/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personinformation;

/**
 *
 * @author lucas
 */
public class Book implements BookInterface {

    private String title;
    private String autor;
    private int numbOfPages;
    private int currentlyPage;
    private boolean oppened;
    private People reader;

    public String detals() {
        return "Book{" + "title=" + title + ",\n autor=" + autor
                + ",\n numbOfPages=" + numbOfPages + ", currentlyPage="
                + currentlyPage + " oppened=" + oppened 
                + ",\n reader=" + reader.getName() + ", age=" + reader.getAge() + ", sex=" + reader.getSex() + '}';
    }

    public Book(String title, String autor, int numbOfPages, People reader) {
        this.title = title;
        this.autor = autor;
        this.numbOfPages = numbOfPages;
        this.oppened = false;
        this.currentlyPage = 0;
        this.reader = reader;
    }
    
    
    
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public int getCurrentlyPage() {
        return currentlyPage;
    }

    public void setCurrentlyPage(int currentlyPage) {
        this.currentlyPage = currentlyPage;
    }

    public boolean isOppened() {
        return oppened;
    }

    public void setOppened(boolean oppened) {
        this.oppened = oppened;
    }

    public People getReader() {
        return reader;
    }

    public void setReader(People reader) {
        this.reader = reader;
    }

    
    
    
    
    

    @Override
    public void open() {
        this.oppened = true;
    }

    @Override
    public void close() {
        this.oppened = false;
    }

    @Override
    public void folhear(int p) {
        
        
        if(p > this.numbOfPages){
            System.out.println("This is not possible, you do not have this amount of pages");
            this.currentlyPage = 0;
        }else{
            this.currentlyPage = p;
        }
    }

    @Override
    public void skipPage() {
        this.currentlyPage++;
    }

    @Override
    public void backPage() {
        this.currentlyPage--;
    }

}
