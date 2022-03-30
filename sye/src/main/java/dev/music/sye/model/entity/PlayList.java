package dev.music.sye.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYLIST")
public class PlayList {

    // 리스트번호
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PLAYLIST_NUMBER", nullable = false, unique = true)
    private Long playListNumber;
    
    // 리스트이름
    @Column(name="PLAYLIST_NAME", nullable = false)
    private String playListName;

    // 리스트썸네일
    @Column(name="PLAYLIST_THUMBNAIL", nullable = true)
    private String playListThumbnail;

    // 좋아요 수
    @Column(name="PLAYLIST_FOLLOW", nullable = true)
    private int playListFollow;


    // Getter, Setter
    
    public void setPlayListThumbnail(String playListThumbnail) {
        this.playListThumbnail = playListThumbnail;
    }

    public void setPlayListNumber(Long playListNumber) {
        this.playListNumber = playListNumber;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public Long getPlayListNumber() {
        return playListNumber;
    }

    public String getPlayListThumbnail() {
        return playListThumbnail;
    }

    public int getPlayListFollow() {
        return playListFollow;
    }

    public void setPlayListFollow(int playListFollow) {
        this.playListFollow = playListFollow;
    }

}
