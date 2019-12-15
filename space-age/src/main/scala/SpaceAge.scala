object SpaceAge {
  def onEarth(years: Int): Double = {
    years/31557600.0
  }

  def onMercury(years: Double): Double = {
    years/(31557600.0*0.2408467)
  }

  def onVenus(years: Double): Double = {
    years/(31557600.0*0.61519726)
  }

  def onMars(years: Double): Double = {
    years/(31557600.0*1.8808158)
  }

  def onJupiter(years: Int): Double = {
    years/(31557600.0*11.862615)
  }

  def onSaturn(years: Double): Double = {
    years/(31557600.0*29.447498)
  }

  def onUranus(years: Double): Double = {
    years/(31557600.0*84.016846)
  }

  def onNeptune(years: Double): Double = {
    years/(31557600.0*164.79132)
  }



}