Feature: Registro y contacto en pagina Web
  Yo como un nuevo cliente de la página http://automationpractice.com/index.php
  Quiero registrarme exitosamente y enviar un mensaje de contacto
  para tener conocimiento de sus ofertas

  Background:
    Given el Cliente está en la pagina de aterrizaje http://automationpractice.com/index.php

  @contacto
  Scenario: Mensaje de Contacto
    When el cliente realizara el proceso para el contacto con la compañía
    Then el cliente  deberá observar el mensaje de  confirmación del envío del mensaje

  @registro
  Scenario: Registro en página web
    When El cliente ingresa la información necesaria para el registro en la pagina web de la compañia
    Then el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación



