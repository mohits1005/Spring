package com.jfs;
import org.springframework.lang.NonNull;

public class Note {
	public Note() {
		super();
	}
    public Note(String text) {
    	this.text = text;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private Long id;
    private @NonNull String text;
}
