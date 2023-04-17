package com.example.market.Services;

import org.springframework.beans.factory.annotation.Autowired;

public class MarketService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }
}
