package med.vol.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.DadosEndereco;
import med.vol.api.endereco.Endereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
