package co.org.softsolut.conozcapacho.ejb.persistencia.entidades;

// Generated 26/10/2013 08:11:24 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", uniqueConstraints = {
		@UniqueConstraint(columnNames = "usu_email"),
		@UniqueConstraint(columnNames = "usu_usuario") })
public class Usuario implements java.io.Serializable {

	private int usuCodigo;
	private String usuNombre;
	private String usuApellido;
	private String usuEmail;
	private String usuUsuario;
	private String usuContrasenia;

	public Usuario() {
	}

	public Usuario(int usuCodigo, String usuNombre, String usuApellido,
			String usuEmail, String usuUsuario, String usuContrasenia) {
		this.usuCodigo = usuCodigo;
		this.usuNombre = usuNombre;
		this.usuApellido = usuApellido;
		this.usuEmail = usuEmail;
		this.usuUsuario = usuUsuario;
		this.usuContrasenia = usuContrasenia;
	}

	@Id
	@Column(name = "usu_codigo", unique = true, nullable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public int getUsuCodigo() {
		return this.usuCodigo;
	}

	public void setUsuCodigo(int usuCodigo) {
		this.usuCodigo = usuCodigo;
	}

	@Column(name = "usu_nombre", nullable = false, length = 20)
	public String getUsuNombre() {
		return this.usuNombre;
	}

	public void setUsuNombre(String usuNombre) {
		this.usuNombre = usuNombre;
	}

	@Column(name = "usu_apellido", nullable = false, length = 20)
	public String getUsuApellido() {
		return this.usuApellido;
	}

	public void setUsuApellido(String usuApellido) {
		this.usuApellido = usuApellido;
	}

	@Column(name = "usu_email", unique = true, nullable = false, length = 50)
	public String getUsuEmail() {
		return this.usuEmail;
	}

	public void setUsuEmail(String usuEmail) {
		this.usuEmail = usuEmail;
	}

	@Column(name = "usu_usuario", unique = true, nullable = false, length = 10)
	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	@Column(name = "usu_contrasenia", nullable = false, length = 10)
	public String getUsuContrasenia() {
		return this.usuContrasenia;
	}

	public void setUsuContrasenia(String usuContrasenia) {
		this.usuContrasenia = usuContrasenia;
	}

}
