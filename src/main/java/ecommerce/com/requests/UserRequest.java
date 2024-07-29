package ecommerce.com.requests;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRequest {
	
	@NotBlank(message="ce champ ne doit etre null !")
	@Size(min=3 , message="ce champ doit avoir au moins 3 caracteres!")
	private String firstName;
	
	@NotBlank(message="ce champ ne doit etre null !")
	@Size(min=3 , message="ce champ doit avoir au moins 3 caracteres!")
	private String lastName;
	
	@NotBlank(message="ce champ ne doit etre null !")
	@Email(message="ce champ doit recepcter le format email !")
	private String email;
	
	@NotBlank(message="ce champ ne doit etre null !")
	@Size(min=8 , message="ce champ doit avoir au moins 8  caracteres")
	@Size(max=12 , message="ce champ doit avoir au max 12 caracteres")
	@Pattern(regexp="(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$" ,message="ce mot de passe doit avoir des lettres en majuscule et miniscule et numero")
	private String password;
	
	private Boolean admin;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	
	

}


