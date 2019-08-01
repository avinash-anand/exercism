object SpaceAge {
  def onEarth(i: Double): Double = i / EarthOrbitalPeriod

  def onMercury(i: Double): Double = i / MercuryOrbitalPeriod

  def onVenus(i: Double): Double = i / VenusOrbitalPeriod

  def onMars(i: Double): Double = i / MarsOrbitalPeriod

  def onJupiter(i: Double): Double = i / JupiterOrbitalPeriod

  def onSaturn(i: Double): Double = i / SaturnOrbitalPeriod

  def onUranus(i: Double): Double = i / UranusOrbitalPeriod

  def onNeptune(i: Double): Double = i / NeptuneOrbitalPeriod

  private val EarthOrbitalPeriod = 365.25 * 24 * 60 * 60
  private val MercuryOrbitalPeriod = 0.2408467 * EarthOrbitalPeriod
  private val VenusOrbitalPeriod = 0.61519726 * EarthOrbitalPeriod
  private val MarsOrbitalPeriod = 1.8808158 * EarthOrbitalPeriod
  private val JupiterOrbitalPeriod = 11.862615 * EarthOrbitalPeriod
  private val SaturnOrbitalPeriod = 29.447498 * EarthOrbitalPeriod
  private val UranusOrbitalPeriod = 84.016846 * EarthOrbitalPeriod
  private val NeptuneOrbitalPeriod = 164.79132 * EarthOrbitalPeriod
}
