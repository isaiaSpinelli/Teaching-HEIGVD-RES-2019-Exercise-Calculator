# Protocole 

1. Quel protocole de transport utilisons-nous? UDP ou TCP 
    je pense TCP pour être sûr de la bonne communication
2. Comment le client trouve-t-il le serveur (adresses et ports)?
    définie de base (fixe) : 192.168.7.7::1025
3. Qui parle en premier?
    le client
4. Quelle est la séquence de messages échangés par le client et le serveur?
    1. Bonjour tu clients ('Hi!')
    2. Bonjour du serveur ('Hi man')
    3. Demande du client   (Opération avec ' ' comme séparateur)
    4. Réponse ou précision du serveur (Réponse de l'opération ou message de correction)
5. Que se passe-t-il lorsqu'un message est reçu de l'autre partie?
    il est ignoré (sauf si c'est le client envoye plusieurs opération)
6. Quelle est la syntaxe des messages? Comment les générons-nous et les analysons-nous?
    Ca doit être le plus simple possible pour le client. 
    Je pense qu'il peut tout simplement envoyer le calcul qu'il souhaite comme nous avons l'habiute en europe ( **1 + ( 4 * 8 ) / 5.3**.
    *Donc séparé par des espaces.*
    Doit finir avec un '=' pour avoir une réponse. (Peut etre ajout d'une mémoire avec '= A' qui stockerai la réponse dans A et le réutiliser ex: '1 + A' )
7. Qui ferme la connexion et quand?
    Le client, lorsqu'il a eu toutes les réponses voulues. (en envoyant 'end')
    
 Exemple d'echange :
 
    Client  : Bonjour !
 
    Client  : Hello !
  
    Client  : fdsfsfd
   
    Client  : Hi!
    Serveur : Hi!
    
    
