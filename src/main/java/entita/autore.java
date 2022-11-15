package entita;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class autore {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @Column
  private String nome;
  @Column
  private Date annoNascita;
  @Column
  private Date annoMorte;
  @Column
  @ManyToMany(mappedBy="autore")
  private List<libro> libri;
public autore(Long id, String nome, Date annoNascita, Date annoMorte, List<libro> libri) {
	super();
	this.id = id;
	this.nome = nome;
	this.annoNascita = annoNascita;
	this.annoMorte = annoMorte;
	this.libri = libri;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Date getAnnoNascita() {
	return annoNascita;
}
public void setAnnoNascita(Date annoNascita) {
	this.annoNascita = annoNascita;
}
public Date getAnnoMorte() {
	return annoMorte;
}
public void setAnnoMorte(Date annoMorte) {
	this.annoMorte = annoMorte;
}
public List<libro> getLibri() {
	return libri;
}
public void setLibri(List<libro> libri) {
	this.libri = libri;
}
}
