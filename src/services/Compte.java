
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "nomCompte",
    "code",
    "solde"
})
public class Compte {

    protected String nomCompte;
    protected Long code;
    protected Float solde;

    /**
     * Obtient la valeur de la propriété nomCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCompte() {
        return nomCompte;
    }

    /**
     * Définit la valeur de la propriété nomCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCompte(String value) {
        this.nomCompte = value;
    }

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSolde(Float value) {
        this.solde = value;
    }

	public void getCompte(String value) {
		// TODO Auto-generated method stub
		this.nomCompte=value;
	}

	/*public void getAllComptes(Compte value) {
		// TODO Auto-generated method stub
		this.getClass();
	}*/

}
