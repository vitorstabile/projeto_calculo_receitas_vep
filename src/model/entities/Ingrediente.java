package model.entities;

import java.io.Serializable;

import model.entities.pk.IngredientePK;

public class Ingrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	private IngredientePK id_MP_Receita = new IngredientePK();

	private Integer id_MP_Receita_PK;
	private Double custoMP;
	private Double qtIngrediente;
	private Double custoIngrediente;
	private Double porcenIngrediente;

	public Ingrediente() {
	}

	public Ingrediente(Integer id_MP_Receita_PK ,MP mp, Receita receita, Double qtIngrediente) {
		this.id_MP_Receita_PK = id_MP_Receita_PK;
		id_MP_Receita.setMp(mp);
		id_MP_Receita.setReceita(receita);
		this.custoMP = mp.getCustoMP();
		this.qtIngrediente = qtIngrediente;
		this.custoIngrediente = mp.getCustoMP() * qtIngrediente;
		this.porcenIngrediente = null;
	}

	public MP getMP() {
		return id_MP_Receita.getMp();
	}

	public void setMP(MP mp) {
		id_MP_Receita.setMp(mp);
	}

	public Receita getReceita() {
		return id_MP_Receita.getReceita();
	}

	public void setReceita(Receita receita) {
		id_MP_Receita.setReceita(receita);
	}
	
	public Integer getId_MP_Receita_PK() {
		return id_MP_Receita_PK;
	}

	public void setId_MP_Receita_PK(Integer id_MP_Receita_PK) {
		this.id_MP_Receita_PK = id_MP_Receita_PK;
	}

	public Double getCustoMP() {
		return custoMP;
	}

	public void setCustoMP(Double custoMP) {
		this.custoMP = custoMP;
	}

	public Double getQtIngrediente() {
		return qtIngrediente;
	}

	public void setQtIngrediente(Double qtIngrediente) {
		this.qtIngrediente = qtIngrediente;
	}

	public Double getCustoIngrediente() {
		return custoIngrediente;
	}

	public void setCustoIngrediente(Double custoIngrediente) {
		this.custoIngrediente = custoIngrediente;
	}

	public Double getPorcenIngrediente() {
		return porcenIngrediente;
	}

	public void setPorcenIngrediente(Double porcenIngrediente) {
		this.porcenIngrediente = porcenIngrediente;
		this.getMP().getCodigoMP();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_MP_Receita == null) ? 0 : id_MP_Receita.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		if (id_MP_Receita == null) {
			if (other.id_MP_Receita != null)
				return false;
		} else if (!id_MP_Receita.equals(other.id_MP_Receita))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ingrediente [id_MP_Receita_PK=" + id_MP_Receita_PK + ", id_MP=" + this.getMP().getId() + ", id_Receita=" + this.getReceita().getIdReceita()
				+ ", custoMP=" + custoMP + ", qtIngrediente="
				+ qtIngrediente + ", custoIngrediente=" + custoIngrediente + ", porcenIngrediente=" + porcenIngrediente
				+ "]";
	}

}
