// Menu Responsivo para Dispositivos Móveis
const mobileMenu = document.getElementById('mobile-menu');
const navLinks = document.querySelector('.nav-links');

mobileMenu.addEventListener('click', () => {
    navLinks.classList.toggle('active');
    
    // Troca o ícone de barras para um 'X' quando ativo
    const icon = mobileMenu.querySelector('i');
    if (navLinks.classList.contains('active')) {
        icon.classList.remove('fa-bars');
        icon.classList.add('fa-xmark');
    } else {
        icon.classList.remove('fa-xmark');
        icon.classList.add('fa-bars');
    }
});

// Fecha o menu móvel ao clicar em qualquer link
document.querySelectorAll('.nav-links a').forEach(link => {
    link.addEventListener('click', () => {
        navLinks.classList.remove('active');
        const icon = mobileMenu.querySelector('i');
        icon.classList.remove('fa-xmark');
        icon.classList.add('fa-bars');
    });
});

// Simulação de Envio de Formulário com Alerta Personalizado
const contactForm = document.getElementById('contact-form');

contactForm.addEventListener('submit', (e) => {
    e.preventDefault(); // Evita o recarregamento da página
    
    const name = document.getElementById('name').value;
    
    // Feedback amigável para o usuário
    alert(`Obrigado pelo contato, ${name}! Sua mensagem sobre o futuro sustentável do agro foi enviada com sucesso.`);
    
    // Limpa o formulário
    contactForm.reset();
});
