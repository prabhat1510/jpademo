/**
 * 
 */
package com.training.springboot.jpa.jpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.training.springboot.jpa.jpademo.model.Note;



/**
 * @author admi
 *
 */
public interface INoteService {
	
	public List<Note> getAllNotes();
	public Note createNote(Note note);
	/**
	public Optional<Note> getNoteById(Long noteId);
	public Optional<Note> updateNote(Long noteId,Note noteDetails);
	public ResponseEntity<?> deleteNote(Long noteId);
	**/
}
