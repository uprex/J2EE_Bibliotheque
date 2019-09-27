package fr.cesi.bibliotheque.classe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.cesi.bibliotheque.servlet.*;

public class LivresDAO {
	
	private static List<Livres> livres = new ArrayList<Livres>();
	private static Long idSequence = 1L;
	
	private LivresDAO() { }
	
	
	public static void addLivre(Livres livre) {
		livre.setId(idSequence++);
		livres.add(livre);
	}
	
	
	public static void updateLivre(Livres livre) {
		int index = getLivreIndexById(livre.getId());
		if(index > -1) {
			livres.set(index, livre);
		} else {
			throw new UnknownProductException(livre.getId());
		}
	}
	
	
	public static Livres findProductById(Long id) {
		int index = getLivreIndexById(id);
		if(index > -1) {
			Livres livre = livres.get(index);
			return livre;
		}
		throw new UnknownProductException(id);
	}
	
	
	public static List<Livres> getAllProducts() {
		return Collections.unmodifiableList(livres);
	}
	
	
	public static void removeLivre(Livres livre) {
		removeLivre(livre.getId());
	}
	
	
	public static void removeLivre(Long id) {
		int index = getLivreIndexById(id);
		if(index > -1) {
			livres.remove(index);
		} else {
			throw new UnknownProductException(id);
		}
	}
	
	private static int getLivreIndexById(Long id) {
		for (int i = 0; i < livres.size(); i++) {
			Livres livre = livres.get(i);
			if(livre.getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void reserverLivre(Long id) {
		int index = getLivreIndexById(id);
		if(index > -1) {
			Livres livre = livres.get(index);
			livre.setEtat(false);
		} else {
			throw new UnknownProductException(id);
		}
	}
	
	public static void rendreLivre(Long id) {
		int index = getLivreIndexById(id);
		if(index > -1) {
			Livres livre = livres.get(index);
			livre.setEtat(true);
		} else {
			throw new UnknownProductException(id);
		}
	}

}
