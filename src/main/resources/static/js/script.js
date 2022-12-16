const cards = Array.from(document.getElementsByClassName('card'));

cards.forEach(card => {
  card.addEventListener('mouseover', () => {
   card.classList.add('shadow-lg')
  });
});

cards.forEach(card => {
    card.addEventListener('mouseout', () => {
      card.classList.remove('shadow-lg')
    });
  });


  $('.btn-plus, .btn-minus').on('click', function(e) {
    const isNegative = $(e.target).closest('.btn-minus').is('.btn-minus');
    const input = $(e.target).closest('.input-group').find('input');
    if (input.is('input')) {
      input[0][isNegative ? 'stepDown' : 'stepUp']()
    }
  })