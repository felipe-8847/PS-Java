package br.com.supera.game.store;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

@Id
   @GeneratedValue
   public long id;

   public String name;

   public double price;

   public short score;

   public String image;
   
   
   public Product() {
	}

   public Product(long id, String name, double price, short score, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.score = score;
		this.image = image;
   }
	
   public Product(String name, double price, String image) {
		this.name = name;
		this.price = price;
		this.image = image;
}
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public short getScore() {
			return score;
		}
		
		public void setScore(short score) {
			this.score = score;
		}
		
		public String getImage() {
			return image;
		}
		
		public void setImage(String image) {
			this.image = image;
		}

		  @Override
			public String toString() {
				return "Product [id=" + id + ", name=" + name + ", price=" + price + ", score=" + score + ", image=" + image
						+ "]";
			}
   
}