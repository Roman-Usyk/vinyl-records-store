package vinyl.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String performer;

    @Column(name = "title_album")
    private String titleAlbum;
    private String genre;
    private String year;
    private String country;
    private String label;
    @OneToMany
    @JoinTable(name = "records_songs",
            joinColumns = @JoinColumn(name = "record_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songList;
    private Double price;
    private Double discount;

    @Column(name = "picture_url")
    private String pictureUrl;
    private String format;
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitleAlbum() {
        return titleAlbum;
    }

    public void setTitleAlbum(String titleAlbum) {
        this.titleAlbum = titleAlbum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Record record = (Record) o;
        return Objects.equals(id, record.id) && Objects.equals(performer, record.performer)
                && Objects.equals(titleAlbum, record.titleAlbum)
                && Objects.equals(genre, record.genre)
                && Objects.equals(year, record.year)
                && Objects.equals(country, record.country)
                && Objects.equals(label, record.label)
                && Objects.equals(songList, record.songList)
                && Objects.equals(price, record.price)
                && Objects.equals(discount, record.discount)
                && Objects.equals(pictureUrl, record.pictureUrl)
                && Objects.equals(format, record.format)
                && Objects.equals(color, record.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, performer, titleAlbum, genre, year, country, label,
                songList, price, discount, pictureUrl, format, color);
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", performer='" + performer + ", titleAlbum='"
                + titleAlbum + ", genre='" + genre + ", year='" + year + ", country='"
                + country + ", label='" + label + ", songList=" + songList + ", price="
                + price + ", discount=" + discount + ", pictureUrl='" + pictureUrl
                + ", format='" + format + ", color='" + color + '}';
    }
}
