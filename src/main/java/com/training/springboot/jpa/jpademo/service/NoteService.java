/**
 * 
 */
package com.training.springboot.jpa.jpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.springboot.jpa.jpademo.dao.NoteRepository;
import com.training.springboot.jpa.jpademo.model.Note;

/**
 * @author admi
 *
 */
@Service
public class NoteService implements INoteService {

	@Autowired
	NoteRepository noteRepository;
	
	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		return noteRepository.findAll();
	}

	@Override
	public Note createNote(Note note) {
		// TODO Auto-generated method stub
		return noteRepository.save(note);
	}

	/**
	@Override
	public Optional<Note> getNoteById(Long noteId) {
		// TODO Auto-generated method stub
		//return noteRepository.findById(noteId).orElseThrow(()=>new ResourceNotFoundException("","",));
		//Optional<Note> note =noteRepository.findById(noteId);
		return noteRepository.findById(noteId);
		
	}

	
	@Override
	public Optional<Note> updateNote(Long noteId, Note noteDetails) {
		Optional<Note> note=noteRepository.findById(noteId);
		note.setTitle(noteDetails.getTitle().toString());
		note.setContent(noteDetails.getContent());
		Note updateNote = noteRepository.save(note);
		return updateNote;
	}

	@Override
	public ResponseEntity<?> deleteNote(Long noteId) {
		//First find by Id and then delete if that note exists
		Optional<Note> note = noteRepository.findById(noteId);
		noteRepository.deleteById(noteId);
		return ResponseEntity.ok().build();
	}
	**/

}
