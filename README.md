# PVP Toggle 

*The simplest way to give your players a choice.*

---
## About
PVP Toggle adds a unique vanilla-like feature to Minecraft. With the `/pvp on`
and `/pvp off` commands player can choose whether they want to
stay neutral or be hostile to other players. Once PVP is turned off players will not be able to hit others or 
get damaged by others.

## Usage
PVP Toggle comese with a set of basic commands and permissions which will soon be fully customizable in the new `config.yml` file. Only give `pvp.admin` to system administrators, as the permission node has access to every `/pvp...` command.

Command | Permission | Usage
------------ | ------------- | -------------
`pvp on / off` | `pvp.toggle`, `pvp.admin` | Toggle own PVP status
`pvp on / off {player}` | `pvp.toggle.others`, `pvp.admin`|Toggle PVP status for other players

## Bugs and more...
If you encounter any type of bugs, whether a feature is not working correctly or your server console is spitting out random errors, please report
them in the [issues](https://github.com/dev-stan/PvpToggleMC/issues/new/choose) section here on GitHub.

The plugin is still in development, we're still looking for bugs and new features to implement, just like with bugs, if you have any 
ideas worth implementing please tell us in the [issues](https://github.com/dev-stan/PvpToggleMC/issues/new/choose) section. If you wish to contact me directly and have your issues / requests dealt with instantly feel free to dm me on discord at `nl#0001`.

**To-do list:**

- [x] Add basic permissions
- [ ] Add `config.yml` file
- [ ] Add `/help` and `/reload` commands
- [ ] Add effects  feature to `pvp on`

