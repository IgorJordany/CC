create table npc(
id int auto_increment primary key,
nome varchar(100),
classificacao varchar(100),
coditem int,
codcenario int,
constraint fk_npc_item FOREIGN KEY (coditem) REFERENCES itens (id),
constraint fk_npc_cenario FOREIGN KEY (codcenario) REFERENCES cenario (id));
