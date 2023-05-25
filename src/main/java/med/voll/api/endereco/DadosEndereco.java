package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        @Size(min = 2, max = 2)
        @Pattern(regexp = "^[A-Z]{2}")
        String uf,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep
) {
}
