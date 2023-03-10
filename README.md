# wiksa-blocker

Minecraft plugin, który blokuje komendy wpisane w configu.

## config.yml
```yml
  # Gdy komenda jest zablokowana
command-blocked: '&4&lBLAD &8>> &cKomenda jest zablokowana'
# Poprawne uzycie
correct-usage: '&4&lBLAD &8>> &7Aby przeladowac plik konfiguracyjny, uzyj: &9/blocker reload'
# Gdy przeladowano plik konfiguracyjny
reload-plugin: '&9&lBLOCKER &8>> &7Pomyslnie przeladowano plik konfiguracyjny'
# Tutaj wpisujesz komendy, ktore chcesz zablokowac
commands:
  - '/help'
  - '/plugins'
  - '/pl'
```
## Instalacja
1. Pobierasz `wiksa-blocker.jar` i wklejasz plugin do folderu z pluginami swojego serwera `server/plugins`
2. Odpalasz serwer
3. Po odpaleniu serwera, stworzy sie plik konfiguracyjny w którym ustawiasz jakie komendy ma blokowac oraz wiadomosci i zapisujesz
4. Potem wchodzisz na serwer i wpisujesz komende `/blocker reload` i gotowe!

##Permisje
Aby użyć komendy `/blocker reload`, potrzebujesz permisji operatora bądź `blocker.reload`
