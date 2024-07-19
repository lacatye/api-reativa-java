# API de Lugares #

Esta API foi desenvolvida juntamente com as orientações da professora e desenvolvedora Giuliana Mendes, seguindo as melhores práticas de arquitetura e design de software para garantir um código robusto e de fácil manutenção. Abaixo estão detalhadas as principais características e os endpoints disponíveis para interação.

## Características Principais ##
- **SOLID:** Princípios de design orientado a objetos foram aplicados para promover um código modular e coeso.
- **Consulta com Filtros Dinâmicos:** Utilização do Query By Example para permitir consultas flexíveis aos dados.
- **API Reativa:** Implementação reativa na web e na camada de banco de dados para melhor desempenho e escalabilidade.
- **Uso de DTOs:** Utilização de Data Transfer Objects para definir de forma clara os contratos da API.
- **Injeção de Dependências:** Gerenciamento eficiente de dependências para promover baixo acoplamento e facilitar a manutenção.
- **Geração Automática de Slugs:** Utilização do Slugify para gerar URLs amigáveis automaticamente.
- **Testes** Testes para verificar a funcionalidade correta da API.

## Endpoints da API ##
- **POST /places:** Cria um novo lugar com os dados fornecidos.
- **GET /places/{id}:** Obtém informações de um lugar pelo ID.
- **GET /places?name={name}:** Busca lugares pelo nome, utilizando o filtro especificado.
- **PATCH /places/{id}:** Atualiza um lugar existente pelo ID, com os novos dados fornecidos.
