package Entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;


import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String denominacion;
}
