### O que acontece

- Ao criar ProxyVideo, o vídeo real não é carregado ainda.

- Só quando o cliente chama play(), o Proxy instancia o RealVideo.

- Se o mesmo vídeo for reproduzido novamente, ele não recarrega do servidor.