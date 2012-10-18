package com.hashedin.data;

public class Movies 
{
	/*movie id | movie title | release date | video release date |
    IMDb URL | unknown | Action | Adventure | Animation |
    Children's | Comedy | Crime | Documentary | Drama | Fantasy |
    Film-Noir | Horror | Musical | Mystery | Romance | Sci-Fi |
    Thriller | War | Western |*/

	private int movieId; 
	private String movieTitle; 
	private String releaseDate;
	private String videoReleaseDate;
	private String iMDbURL;
	private Boolean unknown;
	private Boolean action;
	private Boolean adventure;
	private Boolean animation;
	private Boolean children;
	private Boolean comedy;
	private Boolean crime;
	private Boolean documentary;
	private Boolean drama;
	private Boolean fantasy;
	private Boolean filmNoir;
	private Boolean horror;
	private Boolean musical;
	private Boolean mystery;
	private Boolean romance;
	private Boolean sciFi;
	private Boolean thriller;
	private Boolean war;
	private Boolean western;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getVideoReleaseDate() {
		return videoReleaseDate;
	}
	public void setVideoReleaseDate(String videoReleaseDate) {
		this.videoReleaseDate = videoReleaseDate;
	}
	public String getiMDbURL() {
		return iMDbURL;
	}
	public void setiMDbURL(String iMDbURL) {
		this.iMDbURL = iMDbURL;
	}
	public Boolean getUnknown() {
		return unknown;
	}
	public void setUnknown(Boolean unknown) {
		this.unknown = unknown;
	}
	public Boolean getAction() {
		return action;
	}
	public void setAction(Boolean action) {
		this.action = action;
	}
	public Boolean getAdventure() {
		return adventure;
	}
	public void setAdventure(Boolean adventure) {
		this.adventure = adventure;
	}
	public Boolean getAnimation() {
		return animation;
	}
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}
	public Boolean getChildren() {
		return children;
	}
	public void setChildren(Boolean children) {
		this.children = children;
	}
	public Boolean getComedy() {
		return comedy;
	}
	public void setComedy(Boolean comedy) {
		this.comedy = comedy;
	}
	public Boolean getCrime() {
		return crime;
	}
	public void setCrime(Boolean crime) {
		this.crime = crime;
	}
	public Boolean getDocumentary() {
		return documentary;
	}
	public void setDocumentary(Boolean documentary) {
		this.documentary = documentary;
	}
	public Boolean getDrama() {
		return drama;
	}
	public void setDrama(Boolean drama) {
		this.drama = drama;
	}
	public Boolean getFantasy() {
		return fantasy;
	}
	public void setFantasy(Boolean fantasy) {
		this.fantasy = fantasy;
	}
	public Boolean getFilmNoir() {
		return filmNoir;
	}
	public void setFilmNoir(Boolean filmNoir) {
		this.filmNoir = filmNoir;
	}
	public Boolean getHorror() {
		return horror;
	}
	public void setHorror(Boolean horror) {
		this.horror = horror;
	}
	public Boolean getMusical() {
		return musical;
	}
	public void setMusical(Boolean musical) {
		this.musical = musical;
	}
	public Boolean getMystery() {
		return mystery;
	}
	public void setMystery(Boolean mystery) {
		this.mystery = mystery;
	}
	public Boolean getRomance() {
		return romance;
	}
	public void setRomance(Boolean romance) {
		this.romance = romance;
	}
	public Boolean getSciFi() {
		return sciFi;
	}
	public void setSciFi(Boolean sciFi) {
		this.sciFi = sciFi;
	}
	public Boolean getThriller() {
		return thriller;
	}
	public void setThriller(Boolean thriller) {
		this.thriller = thriller;
	}
	public Boolean getWar() {
		return war;
	}
	public void setWar(Boolean war) {
		this.war = war;
	}
	public Boolean getWestern() {
		return western;
	}
	public void setWestern(Boolean western) {
		this.western = western;
	}
}
