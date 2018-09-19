package fil.coo.tp0;

public class Student {
	
	 private String nom;
	private String numetu;
	/**
	 * Construit un étudiant avec pour attributs la chaine "null".
	 */
	public Student() {
		this.nom = "null";
		this.numetu = "null";
	}
	
	/**
	 * Construit un étudiant avec un nom et un numéro d'étudiant défini.
	 * 
	 * @param n
	 * 		Le nom de l'étudiant.
	 * 
	 * @param num
	 * 		Le numéro de l'étudiant.
	 */
	public Student(String n, String num) {
		this.nom = n;
		this.numetu = num;
	}
	
	/**
	 *@return 
	 *		Le nom de l'étudiant.
	 */
	public String getName() {
		return this.nom;
	}
	
	/**
	 * @return
	 * 		Le numéro de l'étudiant.
	 */
	public String getNumEtu() {
		return this.numetu;
	}
	
	/**
	 * Modifie le nom de l'étudiant.
	 * 
	 * @param name
	 * 			Le nouveau nom de l'étudiant.
	 */
	public void setName(String name) {
		this.nom = name;
	}
	/**
	 * Modifie le numéro de l'étudiant.
	 * @param netu
	 * 			Le nouveau numéro de l'étudiant.
	 */
	public void setNumEtu(String netu) {
		this.numetu = netu;
	}
	/**
	 * Permet de vérifier l'égalité de deux étudiants.
	 * 
	 * @param other
	 * 			L'étudiant avec lequel on veut comparer.
	 * 
	 * @return
	 * 		true si les deux étudiants sont identiques, false sinon.
	 * 	
	 */
	public boolean equals (Student other) {
		return (this.nom.equals(other.getName()) && this.numetu.equals(other.getNumEtu()));
	}
	/**
	 * Permet d'afficher le nom et le numéro de l'étudiant
	 */
	public void affiche() {
		System.out.println("Nom de l'étudiant : "+this.nom+" / Numéro de l'étudiant : "+this.numetu);
	}
}
