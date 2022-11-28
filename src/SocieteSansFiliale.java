package com.company.tpSAE_composite.Exo1_tp9;

public class SocieteSansFiliale extends Societe
{
  public boolean ajouteFiliale(Societe filiale)
  {
    return false;
  }

  public double calculeCoutEntretien()
  {
    return nbrVehicules * coutUnitVehicule;
  }
}
