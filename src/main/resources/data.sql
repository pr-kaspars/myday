insert
into experiment(things)
values ('{"a":"b", "c":123}');

insert
into recognition (message, author, recipient)
values ('Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 'Emma', 'Liam')
,('Cras tempor, dolor nec rutrum consequat, turpis eros posuere nunc, non pharetra dui mi nec enim.', 'Noah', 'Olivia')
,('Maecenas tortor ipsum, vulputate ut malesuada et, scelerisque nec massa.', 'Ava', 'William')
,('Morbi sed tincidunt metus. Pellentesque pulvinar, lectus rhoncus maximus cursus, orci tortor pharetra diam, et porta dui tortor lobortis mi.', 'Isabella', 'James')
,('Integer volutpat pharetra maximus. Sed in augue eu orci vulputate consequat vel nec mi.', 'Oliver', 'Charlotte')
,('Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In eu accumsan urna, lobortis tincidunt est. Aliquam auctor in est gravida scelerisque.', 'Benjamin', 'Mia')
,('Suspendisse sollicitudin turpis ante, vitae ullamcorper tortor consequat at.', 'Amelia', 'Lucas')
,('Sed mattis velit id dictum commodo.', 'Harper', 'Mason')
,('Etiam suscipit molestie turpis, ut euismod velit semper vel.', 'Evely', 'Logan');

insert
into reaction(recognition_id, author, kind, message)
values (1, 'Evely', 'COMMENT', 'Suspendisse at ipsum tristique, porta massa sed, tincidunt mauris.')
,(2, 'Logan', 'COMMENT', 'Suspendisse aliquet, massa non consequat mollis, purus magna aliquet dolor, et iaculis risus nunc ac velit.')
,(3, 'Harper', 'COMMENT', 'Sed tempus libero magna, sit amet tincidunt augue finibus id.')
,(4, 'Mason', 'COMMENT', 'Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.')
,(5, 'Amelia', 'COMMENT', 'Sed orci neque, euismod ut vestibulum sit amet, scelerisque sed enim.')
,(6, 'Lucas', 'COMMENT', 'Interdum et malesuada fames ac ante ipsum primis in faucibus.')
,(7, 'Oliver', 'COMMENT', 'Donec laoreet malesuada facilisis.')
,(8, 'Charlotte', 'COMMENT', 'Pellentesque quis neque in nunc commodo viverra.')
,(9, 'William', 'COMMENT', 'Maecenas malesuada laoreet maximus.')
,(9, 'Evely', 'COMMENT', 'Suspendisse at ipsum tristique, porta massa sed, tincidunt mauris.')
,(8, 'Logan', 'COMMENT', 'Suspendisse aliquet, massa non consequat mollis, purus magna aliquet dolor, et iaculis risus nunc ac velit.')
,(7, 'Harper', 'COMMENT', 'Sed tempus libero magna, sit amet tincidunt augue finibus id.')
,(6, 'Mason', 'COMMENT', 'Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.')
,(1, 'Amelia', 'COMMENT', 'Sed orci neque, euismod ut vestibulum sit amet, scelerisque sed enim.')
,(5, 'Lucas', 'COMMENT', 'Interdum et malesuada fames ac ante ipsum primis in faucibus.')
,(4, 'Oliver', 'COMMENT', 'Donec laoreet malesuada facilisis.')
,(3, 'Charlotte', 'COMMENT', 'Pellentesque quis neque in nunc commodo viverra.')
,(2, 'William', 'COMMENT', 'Maecenas malesuada laoreet maximus.');
