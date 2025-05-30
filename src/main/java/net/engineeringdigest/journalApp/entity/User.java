package net.engineeringdigest.journalApp.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
@Builder

public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NotBlank(message = "Username must not be blank")
    @NonNull
    private String userName;
    private String email;
    private boolean sentimentAnalysis;

    @NonNull
    @NotBlank(message = "Password must not be blank")
    private String password;
    @DBRef
    private List<JournalEntry> journalEntries= new ArrayList<>();

    private List<String> roles;


}
