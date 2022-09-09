package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private int cantidad;
   private String denominacion;
   private int precio;
}
