package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "photos")
public class PhotosEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob()
    @Column(name = "user_photo", columnDefinition = "LONGBLOB")
    private byte[] userPhoto;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersEntity usersEntity;
    public PhotosEntity() {}
    public PhotosEntity(byte[] userPhoto, UsersEntity usersEntity) {
        this.userPhoto = userPhoto;
        this.usersEntity = usersEntity;
    }
}
