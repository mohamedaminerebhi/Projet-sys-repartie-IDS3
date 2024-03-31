# Services de Communication
Ce référentiel contient l'implémentation de différents services de communication utilisant Java RMI, gRPC et les sockets.
## Services a implementer 
### Java RMI :Gestion d'une liste de tâches
1.Ajouter une nouvelle tâche à la liste
  - Méthode : addTask(task: Task)
  - Description : Cette méthode permet d'ajouter une nouvelle tâche à la liste existante.
2.Supprimer une tâche existante de la liste
  - Méthode : removeTask(taskId: int)
  - Description : Cette méthode permet de supprimer une tâche existante de la liste en fonction de son identifiant.
3.Récupérer la liste complète des tâches
  - Méthode : getTaskList()
  - Description : Cette méthode renvoie la liste complète des tâches actuellement enregistrées.
### gRPC : Service de messagerie
1.Envoi de messages texte à un destinataire spécifié
  - Méthode : sendMessage(message: SendMessageRequest)
  - Description : Cette méthode permet d'envoyer un message texte à un destinataire spécifié.
2.Récupération des messages reçus pour un utilisateur donné
  - Méthode : getMessages(message: GetMessageRequest )
  - Description : Cette méthode renvoie les messages reçus pour un utilisateur donné.
### Sockets : Service de chat
1. Envoi de messages texte à un salon de discussion commun
   - Description : Ce service permet aux utilisateurs d'envoyer des messages texte à un salon de discussion commun.
2. Récupération des messages envoyés par d'autres utilisateurs
   - Description : Ce service permet aux utilisateurs de récupérer les messages envoyés par d'autres utilisateurs dans le même salon de discussion.
3. utilisation de java swing pour une meilleur experience pour l utilisateur 
## Deploiemnt et Test
### Java RMI
1. Cloner ce référentiel depuis GitHub : git clone https://github.com/mohamedaminerebhi/Projet-sys-repartie-IDS3/tree/main/TaskManagement/src
2. Accéder au répertoire Java RMI : cd java-rmi
3. Compiler le code : javac *.java
4. Démarrer le registre RMI : start rmiregistry
5. Exécuter le serveur : java TaskServer
6. Exécuter le client : java TaskClient
### gRPC
1. Cloner ce référentiel depuis GitHub : git clone https://github.com/mohamedaminerebhi/Projet-sys-repartie-IDS3/tree/main/GRPC-Messagerie/src/main/java
2. Accéder au répertoire gRPC : cd grpc
3. Installer les dépendances : npm install
4. Démarrer le serveur : java MessagingService.java
5. Exécuter le client : java  MessagingClient.java
### Sockets
1. Cloner ce référentiel depuis GitHub : git clone https://github.com/mohamedaminerebhi/Projet-sys-repartie-IDS3/tree/main/ChatRoom/src
2. Accéder au répertoire Sockets : cd sockets
3. Compiler le code : javac *.java
4. Démarrer le serveur : java Server
5. Exécuter le client : java Client
## Contributeurs
REBHI MOHAMED AMINE (IDS3)
