package entita;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

@Entity
@Table
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column
	private String titolo;
	@Column
	@ManyToMany
	@JoinColumn(name = "autore_Id")
	private List<Autore> autori;
	@Column
	private String ISBN;
	@Column
	private Date annoPubblicazione;
	@Column
	private String editore;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Autore> getAutori() {
		return autori;
	}

	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Date getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Date annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public Libro(Long id, String titolo, List<Autore> autori, String iSBN, Date annoPubblicazione, String editore) {
		super();
		Id = id;
		this.titolo = titolo;
		this.autori = autori;
		ISBN = iSBN;
		this.annoPubblicazione = annoPubblicazione;
		this.editore = editore;
	}

}
