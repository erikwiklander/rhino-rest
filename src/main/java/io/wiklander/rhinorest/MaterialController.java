package io.wiklander.rhinorest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class MaterialController {

    @GetMapping("m")
    public List<Material> getMaterials() {
        return List.of(new Material(1L, "Erik"));
    }

    @Data
    @AllArgsConstructor
    public static class Material {
        private final Long id;
        private final String name;
    }

}