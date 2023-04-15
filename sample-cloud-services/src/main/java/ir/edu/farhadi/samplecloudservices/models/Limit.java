package ir.edu.farhadi.samplecloudservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
public class Limit implements Serializable {
    int maximum;
    int minimum;
}
