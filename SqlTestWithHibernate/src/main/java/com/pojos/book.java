package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books_info")
public class book
{	
	@Id
	@GeneratedValue
	private int bookid;
	private String bookname;
	private String author;
	
	public book(String bookname, String author)
	{
		super();
		this.bookname = bookname;
		this.author = author;
	}

	public book()
	{
		super();
	}

	public int getBookid()
	{
		return bookid;
	}

	public void setBookid(int bookid)
	{
		this.bookid = bookid;
	}

	public String getBookname()
	{
		return bookname;
	}

	public void setBookname(String bookname)
	{
		this.bookname = bookname;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	@Override
	public String toString()
	{
		return "book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
	
	
}
