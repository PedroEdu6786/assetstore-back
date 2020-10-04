package com.example.openpay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class mysqlDB implements DBService {

    @Autowired
    ChargeRepository chargeRepository = new ChargeRepository() {
        @Override
        public List<ChargeAS> findAll() {
            return null;
        }

        @Override
        public List<ChargeAS> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<ChargeAS> findAllById(Iterable<Long> iterable) {
            return null;
        }

        @Override
        public <S extends ChargeAS> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends ChargeAS> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<ChargeAS> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public ChargeAS getOne(Long aLong) {
            return null;
        }

        @Override
        public <S extends ChargeAS> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends ChargeAS> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<ChargeAS> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends ChargeAS> S save(S s) {
            return null;
        }

        @Override
        public Optional<ChargeAS> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(ChargeAS chargeAS) {

        }

        @Override
        public void deleteAll(Iterable<? extends ChargeAS> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends ChargeAS> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends ChargeAS> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends ChargeAS> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends ChargeAS> boolean exists(Example<S> example) {
            return false;
        }
    };

    @Override
    public ChargeDTO createCharge(ChargeDTO charge) {

        ChargeAS chargeAS = new ChargeAS();
        chargeAS.setAmount(charge.getAmount());
        chargeAS.setChargeId(charge.getId());
        chargeAS.setCreationDate(charge.getCreationDate());
        chargeAS.setOperationDate(charge.getOperationDate());
        chargeAS.setStatus(charge.getStatus());
        chargeAS.setDescription(charge.getDescription());
        chargeAS.setCustomerId(charge.getCustomerId());
        chargeAS.setMethod(charge.getMethod());
        chargeAS.setAuthorization(charge.getAuthorization());
        chargeAS.setCurrency(charge.getCurrency());
        System.out.println("Imprimiendo CHARGEAS...");
        System.out.println(chargeAS);
        System.out.println("*Cargo impreso con éxito...");
        chargeRepository.save(chargeAS);

        return charge;
    }

}
