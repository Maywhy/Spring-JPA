insert into tblcurso (nome, cargahora, dtinicio, dtfim) values ('Artes','200', '01/01/2020', '01/01/2021');
insert into tblcurso (nome, cargahora, dtinicio, dtfim) values ('Medicina','1000', '01/01/2020', '01/01/2025');
insert into tblcurso (nome, cargahora, dtinicio, dtfim) values ('Tecnologia','1100', '01/01/2021', '01/01/2026');
insert into tblcurso (nome, cargahora, dtinicio, dtfim) values ('Direito','1200', '01/01/2020', '01/01/2026');

insert into tblaluno (nome, email, telefone, curso_id) values ('Aladin','aladin.aladin@gmail.com','5555-1111',3);
insert into tblaluno (nome, email, telefone, curso_id) values ('Jade','jade.jade@gmail.com','5555-2222',2);
insert into tblaluno (nome, email, telefone, curso_id) values ('Piupiu','piupiu.piupiu@gmail.com','5555-3333',3);
insert into tblaluno (nome, email, telefone, curso_id) values ('Frajola','frajola.frajola@gmail.com','5555-4444',4);

select * from tblaluno;