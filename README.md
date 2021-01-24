# Programação orientada a aspecto
- Imagine que você queira adicionar funcionalidade comum em lugares diferentes do seu código, sem interferir no mesmo. Essa á a proposta deste paradigma, onde separamos as preocupações tranversais, ou seja, permite a modularização de tarefes comuns através de diferentes objetos.

### Alguns recursos
- jointPoint: contém toda a informação sobre o local, onde nosso aspect será inserido
- jointPoint.getSignature() e jointPoint.getArgs(): extrai a assinatura do método, bem como os argumentos de chamada.
