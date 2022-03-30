package gov.iti.jets.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CartId implements Serializable {
    @Column(name="user_id", nullable=false)
    private int userId;
    @Column(name="product_id", nullable=false)
    private int productId;

    public CartId() {
    }

    public CartId(int userId, int productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CartId) ) return false;
		 CartId castOther = ( CartId ) other;

		 return (this.getUserId()==castOther.getUserId())
 && (this.getProductId()==castOther.getProductId());
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + this.getUserId();
         result = 37 * result + this.getProductId();
         return result;
   }

    }
