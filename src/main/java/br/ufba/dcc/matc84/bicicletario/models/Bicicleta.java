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
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -1846419965778792330L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo fabricante tem que ser entre 2 e 100")
    private String bicicleta_fabricante;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo modelo tem que ser entre 2 e 100")
    private String bicicleta_modelo;
    
    @Size(min = 4, max = 20, message = "O tamanho do campo cor tem que ser entre 4 e 20")
    private String bicicleta_cor;
    
    private boolean bicicleta_marcha;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo marca marcha tem que ser entre 2 e 100")
    private String bicicleta_marca_marcha;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo proprietario tem que ser entre 2 e 100")
    private String proprietario;
        
    @Size(min = 2, max = 100, message = "O tamanho do campo celular proprietario tem que ser entre 2 e 100")
    private String bicicleta_proprietario_celular;
    
    @Size(min = 2, max = 100, message = "O tamanho do campo email proprietario tem que ser entre 2 e 100")
    private String bicicleta_proprietario_email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer bicicleta_id) {
        this.id = bicicleta_id;
    }

    public String getBicicleta_fabricante() {
        return bicicleta_fabricante;
    }

    public void setBicicleta_fabricante(String bicicleta_fabricante) {
        this.bicicleta_fabricante = bicicleta_fabricante;
    }

    public String getBicicleta_modelo() {
        return bicicleta_modelo;
    }

    public void setBicicleta_modelo(String bicicleta_modelo) {
        this.bicicleta_modelo = bicicleta_modelo;
    }

    public String getBicicleta_cor() {
        return bicicleta_cor;
    }

    public void setBicicleta_cor(String bicicleta_cor) {
        this.bicicleta_cor = bicicleta_cor;
    }

    public boolean isBicicleta_marcha() {
        return bicicleta_marcha;
    }

    public void setBicicleta_marcha(boolean bicicleta_marcha) {
        this.bicicleta_marcha = bicicleta_marcha;
    }

    public String getBicicleta_marca_marcha() {
        return bicicleta_marca_marcha;
    }

    public void setBicicleta_marca_marcha(String bicicleta_marca_marcha) {
        this.bicicleta_marca_marcha = bicicleta_marca_marcha;
    }

    public String getBicicleta_proprietario() {
        return proprietario;
    }

    public void setBicicleta_proprietario(String bicicleta_proprietario) {
        this.proprietario = bicicleta_proprietario;
    }

    public String getBicicleta_proprietario_celular() {
        return bicicleta_proprietario_celular;
    }

    public void setBicicleta_proprietario_celular(String bicicleta_proprietario_celular) {
        this.bicicleta_proprietario_celular = bicicleta_proprietario_celular;
    }

    public String getBicicleta_proprietario_email() {
        return bicicleta_proprietario_email;
    }

    public void setBicicleta_proprietario_email(String bicicleta_proprietario_email) {
        this.bicicleta_proprietario_email = bicicleta_proprietario_email;
    }
    
}
