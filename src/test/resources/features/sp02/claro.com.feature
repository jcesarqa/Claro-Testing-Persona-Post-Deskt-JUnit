@sp01
Feature: Soliciud de un celular postpago con portabilidad
Como usuario quiero solicitar un celular con plan postpago con portabilidad

Scenario: Un usuario celular con plan postpago con portabilidad

Given estoy en la opcion principal de la tienda claro se abre el home Regalo y me registra 
When selecciono el celular postpago con portabilidad
And agrego a mi bolsa
And seleciono accesorios
And completo el Formulario
And Finalizo la Compra
Then me registro en la pasarela de Pago

#Scenario: Un usuario compra internet movil



