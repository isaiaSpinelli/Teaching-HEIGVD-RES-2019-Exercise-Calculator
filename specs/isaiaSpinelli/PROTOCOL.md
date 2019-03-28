# Protocole 

1. Quel protocole de transport utilisons-nous? UDP ou TCP 
    je pense TCP pour être sûr de la bonne communication
2. Comment le client trouve-t-il le serveur (adresses et ports)?
    définie de base (fixe) : 192.168.7.7::1025
3. Qui parle en premier?
    le client
4. Quelle est la séquence de messages échangés par le client et le serveur?
    1. Bonjour du clients
    2. Bonjour du serveur
    3. Demande du client
    4. Réponse ou précision du serveur
5. Que se passe-t-il lorsqu'un message est reçu de l'autre partie?
    il est ignoré
6. Quelle est la syntaxe des messages? Comment les générons-nous et les analysons-nous?
    Ca doit être le plus simple possible pour le client. je pense qu'il peut tout simplement envoyer le calcul qu'il souhaite comme nous avons l'habiute en europe ( **1 + ( 4 * 8 ) / 5.3** ). Donc séparé par des espaces.
	et doit finir avec un '=' pour avoir une réponse.
7. Qui ferme la connexion et quand?
    Le client lorsqu'il a eu toutes les réponses voulues. (en envoyant 'end')

    
