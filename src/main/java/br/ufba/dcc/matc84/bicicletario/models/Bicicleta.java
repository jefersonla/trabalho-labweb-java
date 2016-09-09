package br.ufba.dcc.matc84.bicicletario.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author jeferson
 */
@Entity
public class Bicicleta implements Serializable{
 
	private static final long serialVersionUID = -1846419965778792330L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo fabricante tem que ser entre 2 e 100")
    private String fabricante;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo modelo tem que ser entre 2 e 100")
    private String modelo;
    
    @Size(min = 4, max = 20, message = "O tamanho do campo cor tem que ser entre 4 e 20")
    private String cor;
    
    @Size(min = 3, max = 5, message = "O tamanho do campo marcha tem que ser entre 3 e 5")
    private String marcha;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo marca marcha tem que ser entre 2 e 100")
    private String marca_marcha;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo proprietario tem que ser entre 2 e 100")
    private String proprietario;
        
    @Size(min = 2, max = 100, message = "O tamanho do campo celular proprietario tem que ser entre 2 e 100")
    private String celular;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo email proprietario tem que ser entre 2 e 100")
    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarcha() {
		return marcha;
	}

	public void setMarcha(String marcha) {
		this.marcha = marcha;
	}

	public String getMarca_marcha() {
		return marca_marcha;
	}

	public void setMarca_marcha(String marca_marcha) {
		this.marca_marcha = marca_marcha;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
