/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;
/**
 *
 * @author imash
 */
public class Book {
    private String title;
    private String author;
    private int pages; 
    
    public Book(String title,String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String getBookType(){
        if (pages<100){
            return "Short Book";}
        else{
            return "Regular Book";
        }
    }
}

