package com.jonas.satanderdevweek2023.domain.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_feature")
public class Feature extends BaseItem{
}
