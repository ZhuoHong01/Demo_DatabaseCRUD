package sg.edu.rp.c346.id21018193.demodatabasecrud;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Note implements Serializable {


    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() { return id; }

    public String getNoteContent() { return noteContent; }

    @NonNull
    @Override
    public String toString() {
        return id + "\n" + noteContent;
    }

    public void setNoteContent(String toString) {
    }
}


